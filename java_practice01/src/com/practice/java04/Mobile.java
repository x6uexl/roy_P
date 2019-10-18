package com.practice.java04;
//函数的返回值，参数个数，类型如何定义取决想通过此函数实现什么功能
public class Mobile {
    //全局变量（成员变量）

    public String brand;//手机品牌

    public  Integer price;//手机价格
    //String void 返回类型
    //sendMessage 发短信函数
    public void sendMessage(String name) {//如果要返回多个姓名，则用数组 String[] names
        System.out.println(name+"联系你");
        System.out.println("---发自价格为:"+this.price+",品牌为:"+this.brand+"的手机");
    }
    /**
     *返回手机的价格和品牌信息
     *@return
     */
    public String getMobileInfo() {

        return "手机品牌:"+this.brand +"，手机价格:"+this.price;
    }
    /**
     * 无参构造函数，作用创建一个最原始的对象
     */

    public Mobile() {
        /**带参构造函数，作用：能够按照我们的医院来初始化一个对象
         * @param name
         * 	@param money
         */
    }
    public Mobile(String name,int  money) {//形参
        this.brand=name;
        this.price=money;
    }
    //@SuppressWarnings("unused")
    public static void main(String[] args) {
        //通过调用无参构造函数，创建一个对象
      //  @SuppressWarnings("unused")
        Mobile mobile1 = new Mobile();
        //调用带参构造函数，创建一个对象
        // 构造函数和类名一样
        //调用带参构造函数，创建一个对象，品牌 ：华为；价格：888；
        Mobile mobile2= new Mobile("华为",888);//实参
        String info1=  mobile1.getMobileInfo();
        String info2= mobile2.getMobileInfo();
        System.out.println(info1);
        System.out.println(info2);
        //发短信--
        mobile2.sendMessage("xxl");
    }
	public void brand() {
		// TODO Auto-generated method stub
		
	}
}
