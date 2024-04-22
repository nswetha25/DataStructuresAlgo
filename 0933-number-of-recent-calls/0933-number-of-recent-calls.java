class RecentCounter {
//https://www.youtube.com/watch?v=HlmNEfcgyjM

    Queue<Integer> queue;
    
    public RecentCounter() {
        queue=new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        queue.add(t);
        
         
        //queue.peek() is a method used in Java's Queue interface that retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. Unlike queue.poll(), which also removes the head of the queue, peek() only returns the element at the head without altering the queue's contents.
        while(queue.peek()< t-3000){
            //queue.poll() is a method used in the context of Java's Queue interface. It retrieves and removes the head (first element) of this queue, or returns null if this queue is empty. This is in contrast to the remove() method, which also removes and returns the head of the queue, but throws an exception if the queue is empty.
            
            queue.poll();
           

        }
         
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */