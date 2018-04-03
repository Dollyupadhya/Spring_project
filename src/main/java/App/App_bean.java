package App;

public class App_bean {
	 String msg,hel;
	 int n;
	
	App_bean(int i){
System.out.println(i);	}
	App_bean(String i,int j){
		System.out.println(i+j);	}
public void setMsg(String msg)
{
	this.msg=msg;}
public String getMsg()
{
	System.out.println("Your message:" +msg);
	return msg;
	}

public String getMsg(int i)
{
	System.out.println("Your message:" +msg);
	return msg;
	}



}

