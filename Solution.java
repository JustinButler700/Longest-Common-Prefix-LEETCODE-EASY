// Justin Butler 10/5/2021
class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        char[] currLong = strs[0].toCharArray(); // holds our current longest prefix.
        for(int i = 1; i < strs.length; i++)
        {
            if(currLong.length==0){return "";}
            String curr = ""; // holds prefix at current index
            for(int k = 0; k < strs[i].length(); k++)
            {
                if(k < currLong.length) // prevent index out of bounds
                {
                    if(strs[i].charAt(k) == currLong[k]) // compare current prefix to longest known
                    {
                    curr += strs[i].charAt(k);
                    }
                    else
                    {
                        break;
                    }
                }
                else
                    break;
            }
            if(!curr.equals(new String(currLong))) 
            {
                currLong = curr.toCharArray();
            }
        }
        return (new String(currLong));
        
    }
}
