package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/logger-rate-limiter/

 */
public class L359_LoggerRateLimiter {
    private static class Logger {

        public Map<String, Integer> logs;

        /**
         * Initialize your data structure here.
         */
        public Logger() {
            logs = new HashMap<String, Integer>();
            return;
        }

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {
            if (!logs.containsKey(message)){
                logs.put(message, timestamp);
                return true;
            }
            else{
                int preTimestamp = logs.get(message);
                if (timestamp - preTimestamp  < 10){
                    return false;
                }
                logs.put(message, timestamp);
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Logger obj = new Logger();
        boolean param_1 = obj.shouldPrintMessage(1, "hello");
    }
}

