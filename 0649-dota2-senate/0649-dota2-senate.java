class Solution {
    public String predictPartyVictory(String senate) {
        
       int n= senate.length();
        //Lets use circular queue
        
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                radiant.add(i);
            }
            else{
                dire.add(i);
            }
        }
        
        //lets simulate the round based voting
        
        while(!radiant.isEmpty() && !dire.isEmpty()){
            
            int rindex= radiant.poll();
            int lindex=dire.poll();
            if(rindex<lindex){
                 // Radiant senator votes first, re-add to queue for next round
                
                radiant.add(rindex+n);
            }
            else{
                dire.add(lindex+n);
            }
        }
        
        return radiant.isEmpty()? "Dire" :"Radiant";
        
        
        
    }
}