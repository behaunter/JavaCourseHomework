package algorithms.lesson_8;

import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        //1 task - planning of your tasks
        List<Integer>tasks = Arrays.asList(3,2,1,4,5,2);
        int maxTime = 9;
        List<Integer>resolved = taskSelection(tasks, maxTime);
        System.out.println(resolved);

        //2 task - change of coins
        List<Integer>coins = Arrays.asList(1,5,10,25);
        int amount = 63;
        System.out.println(coinChange(coins,amount));

        //3 task
        List<Item> items = Arrays.asList(new Item("A",7, 100),new Item("B",5,80),new Item("C",3,50));
        int capacity = 10;
        List<Item>result = fractionalKnapsack(items,capacity);
        System.out.println(result);

    }

    static List<Integer> taskSelection(List<Integer> tasks, int maxTime){
        List<Integer> result = new ArrayList<>();
        int resultTime = 0;

        LinkedList<Integer> sortedTasks = new LinkedList<>(tasks);
       Collections.sort(sortedTasks);
        while(resultTime < maxTime && maxTime - resultTime >= sortedTasks.peek() ){
            int taskTime = sortedTasks.pop();
            result.add(taskTime);
            resultTime = resultTime + taskTime;
            }
        return result;
        }

        static List<Integer> coinChange (List<Integer>coins, int amount){
            List<Integer> result = new ArrayList<>();
            int resultSum = 0;


            Collections.sort(coins);
            for (int i = coins.size() - 1; i >= 0; i--) {
                while (amount >= coins.get(i)){
                    amount = amount - coins.get(i);
                    result.add(coins.get(i));
                }
            }
            if (amount == 0){
                return result;
            }
            return Collections.EMPTY_LIST;
        }

        //3 task -- fractionalKnapsack
        static  List<Item> fractionalKnapsack (List<Item>items, int capacity){

            List<Item> result = new ArrayList<>();
            Collections.sort(items);

            int currentWeight = 0;

            for (Item item : items) {
                if (currentWeight + item.getWeight() <= capacity) {
                    currentWeight = currentWeight + item.getWeight();
                    result.add(item);
                } else {
                    break;
                }
            }

            return result;
        }


    }

