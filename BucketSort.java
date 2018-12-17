
1.便利原始数组，找出最大值
2.创建一个数组，长度为最大值加一
3.当新数组坐标等于原始数组里的一个值时，在新数组坐标位置上加一，并依次累加
4.输出新数组内值不为零的下标，值为几输出几次下标
int[] a=user.input;
int temp=a[0];
for(int i=1;i<a.length;i++){
  if(temp<a[i]){
    temp=a[i];
  }
}
int[]b=new int[temp+1];
int c=0;
		while(c<b.length) {
		    for(int ain=0;ain<a.length;ain++){
		         if(c==a[ain]){
		           System.out.print(c);
		         }
		    }
		c++;
    }
    

    
  

