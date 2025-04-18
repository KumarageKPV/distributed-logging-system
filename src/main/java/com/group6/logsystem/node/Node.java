//package com.group6.logsystem.node;
//
//import com.group6.logsystem.consensus.ConsensusModule;
//import com.group6.logsystem.consensus.LeaderElectionService;
//import com.group6.logsystem.consensus.RaftNode;
//import com.group6.logsystem.grpc.LogEntry;
//import com.group6.logsystem.grpc.LogRequest;
//import com.group6.logsystem.grpc.LogResponse;
//import com.group6.logsystem.grpc.LogServiceGrpc;
//import com.group6.logsystem.util.ConfigLoader;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//import java.util.Arrays;
//
//public class Node {
//
//    private final String nodeId;
//    private boolean isLeader;
//    private final List<LogEntry> logs;
//    private final LogServiceGrpc.LogServiceBlockingStub logServiceStub;
//    private final ConsensusModule consensusModule;
//
//    // Load configuration and set up peer list and peer address
//    private static List<String> peersList;
//    private static String peerAddress;
//
//    static {
//        try {
//            Properties config = ConfigLoader.loadConfig("config.properties");
//            String peersListString = config.getProperty("peers");
//            peerAddress = config.getProperty("peerAddress");
//
//            // Convert comma-separated string into List
//            peersList = Arrays.asList(peersListString.split(","));
//        } catch (Exception e) {
//            e.printStackTrace();
//            peersList = new ArrayList<>();
//            peerAddress = "localhost:50052"; // Default fallback
//        }
//    }
//
//    public Node(String nodeId, LogServiceGrpc.LogServiceBlockingStub logServiceStub) {
//        this.nodeId = nodeId;
//        this.isLeader = false;
//        this.logs = new ArrayList<>();
//        this.logServiceStub = logServiceStub;
//
//        // Create a temporary RaftNode (without consensus module yet) for LeaderElectionService
//        RaftNode tempRaftNode = new RaftNode(nodeId, peersList, null);
//        LeaderElectionService leaderElectionService = new LeaderElectionService(raftNode, peers);
//
//        // LeaderElectionService leaderElectionService = new LeaderElectionService(tempRaftNode, new ArrayList<>()); // Placeholder empty list for RaftNode peers
//
//        // Now create the full RaftNode with a real LeaderElectionService
//        RaftNode raftNode = new RaftNode(nodeId, peersList, leaderElectionService);
//
//        // Update leaderElectionService reference
//        leaderElectionService.setRaftNode(raftNode); // Ensure it references the final RaftNode
//
//        this.consensusModule = new ConsensusModule(raftNode, peerAddress);
//    }
//
//    public void start() {
//        System.out.println("Starting node: " + nodeId);
//        consensusModule.start();
//    }
//
//    public void shutdown() {
//        System.out.println("Shutting down node: " + nodeId);
//        consensusModule.shutdown();
//    }
//
//    public void failover() {
//        System.out.println("Node " + nodeId + " is failing over.");
//        isLeader = false;
//        consensusModule.handleFailover();
//    }
//
//    public void setLeaderStatus(boolean isLeader) {
//        this.isLeader = isLeader;
//        consensusModule.updateLeaderStatus(isLeader);
//    }
//
//    public void sendLog(LogEntry logEntry) {
//        if (!isLeader) {
//            System.out.println("Only leaders can send log entries!");
//            return;
//        }
//
//        LogRequest request = LogRequest.newBuilder()
//                .setNodeId(nodeId)
//                .setMessage(logEntry.getMessage())
//                .setTimestamp(logEntry.getTimestamp())
//                .setTerm(logEntry.getTerm())
//                .build();
//
//        try {
//            LogResponse response = logServiceStub.sendLog(request);
//            System.out.println("Log entry sent: " + response.getMessage());
//        } catch (Exception e) {
//            System.out.println("Failed to send log entry: " + e.getMessage());
//        }
//    }
//
//    public void appendLog(LogEntry logEntry) {
//        logs.add(logEntry);
//        System.out.println("Log entry appended to node " + nodeId + ": " + logEntry.getMessage());
//    }
//
//    public String getNodeId() {
//        return nodeId;
//    }
//
//    public boolean isLeader() {
//        return isLeader;
//    }
//
//    public List<LogEntry> getLogs() {
//        return logs;
//    }
//
//    public ConsensusModule getConsensusModule() {
//        return consensusModule;
//    }
//}
