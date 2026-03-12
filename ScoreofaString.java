class ScoreofaString {
    public int scoreOfString(String s) {
        
        int score = 0;   // store total score
        
        for(int i = 0; i < s.length() - 1; i++) {
            
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            
            score = score + diff;
        }
        
        return score;
    }
}