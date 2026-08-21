class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k==0)
        return 0;
        int lefts=0;
        int rights=0;
        int maxsum=0;
        for(int i=0;i<k;i++)
        {
            lefts=lefts+cardPoints[i];
        }
        maxsum=lefts;
        int l=cardPoints.length;
        for(int i=0;i<k;i++)
        {
            lefts=lefts-cardPoints[k-i-1];
            rights=rights+cardPoints[l-i-1];
            maxsum=Math.max(maxsum,lefts+rights);
        }
        return maxsum;
    }
}