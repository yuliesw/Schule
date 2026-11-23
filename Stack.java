public class Stack {
    private class StackNode{
        private ContentType content;
        private StackNode nextNode;
        public StackNode (ContentType pContent){
            content= pContent;
            nextNode = null;
        }
        public void setNext (StackNode pNext){
            nextNode=pNext;
        }
        public StackNode getNext(){
            return nextNode;
        }
        public ContentType getContent(){
            return content;
        }
        private StackNode head;
        public Stack(){
            head=null;
        }
        public boolean isEmpty(){
         return (head==null);
        }
        public void push (ContentType pContent){
            if (pContent != null){
                StackNode node = new StackNode (pContent);
                node.setNext(head);
                head=node;
            }
        }
        public ContentType top(){
            if (!this.isEmpty()){
                return head.getContent();
            }
            else{
                return null;
            }
        }
        public void pop(){
            if ( head != isEmpty()){
                head = head.getNext();
        }
    }
}
