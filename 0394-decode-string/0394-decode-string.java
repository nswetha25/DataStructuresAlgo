class Solution {
    public String decodeString(String s) {
        //https://www.youtube.com/watch?v=bjprC1Pvu2Y
        //Lets have two stacks one for numbers and other for characters

        Stack<Integer> numstack=new Stack<>();
        Stack<StringBuilder> strstack=new Stack<>();
        
        int num=0;
        StringBuilder str=new StringBuilder();
        
        for(char ch:s.toCharArray()){
           // System.out.println("char :"+ch);
            if(Character.isDigit(ch)){

                num=(num*10)+(ch-'0');
                //System.out.println("num :"+num);
                
            }

           else if(ch=='['){
                strstack.push(str);
               // System.out.println("strstack :"+strstack);
                str=new StringBuilder();
               // System.out.println("str :"+str);
                numstack.push(num);
               // System.out.println("numstack :"+numstack);
                  
                num=0;

            }
            else if(ch==']'){
                StringBuilder temp=str;
               // System.out.println("temp :"+temp);
                str=strstack.pop();
               // System.out.println("str :"+str);
                int count=numstack.pop();
                //System.out.println("count :"+count);

                while(count>0){
                    str.append(temp);
                    count--;
                }

            }
            else{
                str.append(ch);
            }
        }

        return str.toString();


        
    }
}