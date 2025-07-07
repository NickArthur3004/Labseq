package org.nicolas.Services;

import java.util.concurrent.ConcurrentHashMap;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabSeqService {

    public long computeLabseq(int n) {
    if (n < 0) throw new IllegalArgumentException("Index must be non-negative");

    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 0;
    if (n == 3) return 1;

    long[] dp = new long[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 0;
    dp[3] = 1;

    for (int i = 4; i <= n; i++) {
        dp[i] = dp[i - 4] + dp[i - 3];
    }

    return dp[n];
}

}
