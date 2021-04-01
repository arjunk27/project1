import java.util.*;
import java.lang.String.*;
class pshot{
public static void main(String args[]){
int t,n,ag=0,bg=0,ad,bd,an,bn,d=0,j,k;
String st;
Scanner s=new Scanner(System.in);
t=s.nextInt();
for(int i=0;i<t;i++){
n=s.nextInt();
an=bn=n;

st=s.next();
	for(j=0;j<(2*n);j++){
	if(st.charAt(j)=='1')d++;
	--an;
	if(d>bn){j++;break;}
	j++;
	if(st.charAt(j)=='1')--d;
	--bn;
	k=d*-1;
	if(d>an){j++;break;}
	}
System.out.println(j);
}
}
}