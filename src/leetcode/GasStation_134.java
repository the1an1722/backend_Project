package leetcode;

public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0; // Current starting point
        int totalGas = 0; // Total gas
        int currentGas = 0; // Current gas

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            currentGas += diff;

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        return totalGas >= 0 ? start : -1;
    }
}
