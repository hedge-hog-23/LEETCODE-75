  int currentSum = 0;
        for (int i = 0; i < k; i++) 
            currentSum += nums[i];
        
        int maxSum = currentSum;
        
        for (int i = k; i < nums.length; i++) {
            // Update the current sum by adding the new element and removing the element 'k' positions behind
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        // Return the maximum average
        return (double) maxSum / k;
    }
