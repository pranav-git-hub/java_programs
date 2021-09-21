
class SunMicroSystem{
   


	void clang()
	{
		System.out.println("C lang by SunMicroSystem...Base");
	}
    void JAVA()
    {
        System.out.println("Java program....");
    }
}


class Oracle2 extends SunMicroSystem {


    void clang()
	{
		System.out.println("C language by Oracle...Derived");
	}
    void DBMS()
    {
        System.out.println("SQl...");        
    }
    public static void main(String[] args) {
        
        Oracle2 Obj = new Oracle2();
        Obj.clang();
       

    }
    
}
