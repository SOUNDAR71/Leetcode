int maxAdjacentDistance(int* nums, int numsSize) {
    int sum = INT_MIN;

    for (int i = 0; i < numsSize; i++) {

        sum = (abs(nums[i] - nums[(i + 1) % numsSize]) > sum)
                  ? abs(nums[i] - nums[(i + 1) % numsSize])
                  : sum;
    }
    return sum;
}