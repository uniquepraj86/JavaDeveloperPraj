import java.util.*;
import java.io.*;

public class MusicRecommendationSystem {
    private Map<String, List<String>> userHistory;
    private Map<String, List<String>> itemFeatures;
    private Map<String, Double> itemWeights;

    public MusicRecommendationSystem() {
        userHistory = new HashMap<>();
        itemFeatures = new HashMap<>();
        itemWeights = new HashMap<>();
    }

    // Load user history data from a file
    public void loadUserHistory(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String user = tokens[0];
            String item = tokens[1];
            if (!userHistory.containsKey(user)) {
                userHistory.put(user, new ArrayList<>());
            }
            userHistory.get(user).add(item);
        }
        br.close();
    }

    // Load item feature data from a file
    public void loadItemFeatures(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String item = tokens[0];
            if (!itemFeatures.containsKey(item)) {
                itemFeatures.put(item, new ArrayList<>());
            }
            for (int i = 1; i < tokens.length; i++) {
                itemFeatures.get(item).add(tokens[i]);
            }
            itemWeights.put(item, 0.0);
        }
        br.close();
    }

    // Calculate item weights based on user history and item features
    public void calculateItemWeights() {
        for (String user : userHistory.keySet()) {
            List<String> items = userHistory.get(user);
            for (String item : items) {
                List<String> features = itemFeatures.get(item);
                for (String feature : features) {
                    if (!itemWeights.containsKey(feature)) {
                        itemWeights.put(feature, 0.0);
                    }
                    itemWeights.put(feature, itemWeights.get(feature) + 1.0 / items.size());
                }
            }
        }
    }

    // Get recommended items for a user
    public List<String> getRecommendedItems(String user, int numItems) {
        List<String> items = userHistory.get(user);
        List<String> recommendedItems = new ArrayList<>();
        Map<String, Double> itemScores = new HashMap<>();
        for (String item : itemFeatures.keySet()) {
            List<String> features = itemFeatures.get(item);
            double score = 0.0;
            for (String feature : features) {
                if (itemWeights.containsKey(feature)) {
                    score += itemWeights.get(feature);
                }
            }
            itemScores.put(item, score);
        }
        List<Map.Entry<String, Double>> itemList = new LinkedList<>(itemScores.entrySet());
        Collections.sort(itemList, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Double> item : itemList) {
            if (!items.contains(item.getKey())) {
                recommendedItems.add(item.getKey());
            }
            if (recommendedItems.size() >= numItems) {
                break;
            }
        }
        return recommendedItems;
    }

    public static void main(String[] args) throws IOException {
        MusicRecommendationSystem mrs = new MusicRecommendationSystem();
        mrs.loadUserHistory("user_history.csv");
        mrs.loadItemFeatures("item_features.csv");
        mrs.calculateItemWeights();
        List<String> recommendedItems = mrs.getRecommendedItems("user1", 5);
        System.out.println("Recommended items:");
        for (String item : recommendedItems) {
            System.out.println(item);
        }
    }
}
