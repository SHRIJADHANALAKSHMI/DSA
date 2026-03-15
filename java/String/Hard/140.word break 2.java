import java.util.*;

class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {

        Set<String> dict = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();

        return dfs(s, dict, memo);
    }

    private List<String> dfs(String s, Set<String> dict, Map<String, List<String>> memo) {

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();

        if (s.length() == 0) {
            result.add("");
            return result;
        }

        for (String word : dict) {

            if (s.startsWith(word)) {

                List<String> subList = dfs(s.substring(word.length()), dict, memo);

                for (String sub : subList) {

                    if (sub.equals("")) {
                        result.add(word);
                    } else {
                        result.add(word + " " + sub);
                    }
                }
            }
        }

        memo.put(s, result);
        return result;
    }
}

/*
Problem Idea

You are given:

String s

Dictionary wordDict

You must insert spaces so that every word exists in the dictionary.

Return all possible sentences.

Example:

s = "catsanddog"
wordDict = ["cat","cats","and","sand","dog"]

Possible splits:

cats and dog
cat sand dog

Output:

["cats and dog","cat sand dog"]
2️⃣ Key Observation

We must try every possible prefix.

Example:

catsanddog

Possible prefixes:

cat
cats

Then solve remaining string recursively.

3️⃣ Best Approach

Use Backtracking + Memoization (DFS).

Why?

Because many substrings repeat.

Example:

sanddog
anddog
dog

Memoization saves results to avoid recomputation.

4️⃣ Algorithm (Easy Steps)

Convert wordDict → HashSet
Start recursion from index 0
Try every substring
If substring exists in dictionary
Recursively solve remaining string
Combine results
Store results in memo
*/