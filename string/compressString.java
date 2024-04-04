

public class compressString {
    public static void main(String args[]){
    String str="aaabccdddeffff";
    //output --> a3b4c2d3e
    //StringBuilder sb=new StringBuilder("");
    String ans="";
    int count=1,n=str.length()-1;
    for(int i=0;i<n;i++){
        char ch=str.charAt(i),next=str.charAt(i+1);
        if(ch==next) count++;
        else{
            ans+=ch;
            if(count!=1) ans+=count;
            count=1;
        }if(i==n-1&&next!=ch)ans+=next;
    }System.out.println(ans);
    }
}
