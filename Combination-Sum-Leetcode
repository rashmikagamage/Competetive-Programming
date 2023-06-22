#include <vector>

class Solution {
public:
    std::vector<int> candidates = {2, 3, 5};
    int target = 8;
    std::vector<std::vector<int>> ans;
    std::vector<std::vector<int>> returnAns;
    std::vector<int> tempAns;
    int sum = 0;

    std::vector<std::vector<int>> combinationSum(std::vector<int>& candidates, int target) {
        // Call the helper function to perform backtracking
        combS(sum, candidates, target, 0);
        return returnAns;
    }

private:
    // Backtracking helper function
    void combS(int sum, std::vector<int> candidate, int target, int k) {
        if (sum == target) {
            // Valid combination found, add it to the result
            returnAns.push_back(tempAns);
        } else if (sum > target) {
            // Current sum exceeds target, backtrack
            return;
        } else {
            // Explore all possible candidates
            for (int i = 0; i < candidate.size(); i++) {
                if (i >= k) {
                    tempAns.push_back(candidate.at(i));
                    sum += candidate.at(i);

                    // Recursive call with updated values
                    combS(sum, candidate, target, i);

                    sum -= candidate.at(i);
                    tempAns.pop_back();
                }
            }
        }
    }
};

// Example usage
int main() {
    Solution solution;
    std::vector<int> candidates = {2, 3, 5};
    int target = 8;
    std::vector<std::vector<int>> combinations = solution.combinationSum(candidates, target);

    // Display the result
    for (const auto& combination : combinations) {
        for (int num : combination) {
            std::cout << num << " ";
        }
        std::cout << std::endl;
    }

    return 0;
}
