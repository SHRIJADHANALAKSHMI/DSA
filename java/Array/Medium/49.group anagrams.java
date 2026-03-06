/*Step-by-Step Idea

1️⃣ Loop through each word

Take every string from the input array strs.

Example: "eat", "tea", "tan".

2️⃣ Convert the word into characters

Change the string into a character array so we can manipulate it.

"eat" → ['e','a','t'].

3️⃣ Sort the characters

Sorting makes all anagrams look the same.

"eat" → "aet"

"tea" → "aet"

"ate" → "aet"
Now we know they belong to the same group.

4️⃣ Use the sorted string as a key

Store groups in a HashMap.

Key = sorted word

Value = list of original words.

Example map while processing:

"aet" → ["eat", "tea", "ate"]
"ant" → ["tan", "nat"]
"abt" → ["bat"]

5️⃣ Add the word to the correct group

If the key already exists → add to the list.

If not → create a new list first.

6️⃣ Return all groups

Finally return all the lists stored in the map.

Output:

[["eat","tea","ate"],["tan","nat"],["bat"]]

Simple Way to Remember
Sort → Use as key → Store in HashMap → Return groups
Because:
Anagrams become identical when their letters are sorted.
*/

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}