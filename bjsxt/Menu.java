package com.bjsxt;


/**
 * Generate all menus.
 */

public class Menu {
    //主界面
    public void mainMenu () {
        System.out.println("*******************************");
        System.out.println("**     1 Create contact      **");
        System.out.println("**     2 Search contact      **");
        System.out.println("**     3 Edit contact        **");
        System.out.println("**     4 Delete contact      **");
        System.out.println("**     5 Order contact       **");
        System.out.println("**     6 Exit                **");
        System.out.println("*******************************");
    }

    //添加界面
    public void addMenu () {
        System.out.println("********************************");
        System.out.println("**    1 Create new contact    **");
        System.out.println("**    2 Show all contact      **");
        System.out.println("**    3 Return                **");
        System.out.println("********************************");
    }

    //查找界面
    public void searchMenu () {
        System.out.println("********************************");
        System.out.println("**    1 Search by name        **");
        System.out.println("**    2 Search by age         **");
        System.out.println("**    3 Search by gender      **");
        System.out.println("**    4 Search by tel-number  **");
        System.out.println("**    5 Search by address     **");
        System.out.println("**    6 Show all contact      **");
        System.out.println("**    7 Return                **");
        System.out.println("********************************");
    }

    //修改界面
    public void modifyMenu () {
        System.out.println("*******************************");
        System.out.println("**    1 Show all contact     **");
        System.out.println("**    2 Edit contact         **");
        System.out.println("**    3 Return               **");
        System.out.println("*******************************");
    }

    //修改子界面
    public void subModifyMenu () {
        System.out.println("******************************");
        System.out.println("**     1 Edit name          **");
        System.out.println("**     2 Edit age           **");
        System.out.println("**     3 Edit gender        **");
        System.out.println("**     4 Edit tel-number    **");
        System.out.println("**     5 Edit address       **");
        System.out.println("**     6 Return             **");
        System.out.println("******************************");
    }

    //删除界面
    public void deleteMenu () {
        System.out.println("******************************");
        System.out.println("**     1 Show all contact   **");
        System.out.println("**     2 Delete contact     **");
        System.out.println("**     3 Delete all contact **");
        System.out.println("**     4 Return             **");
        System.out.println("******************************");
    }

    //排序界面
    public void orderMenu () {
        System.out.println("******************************");
        System.out.println("**     1 Order by name      **");
        System.out.println("**     2 Order by age       **");
        System.out.println("**     3 Order by gender    **");
        System.out.println("**     4 Show all contact   **");
        System.out.println("**     5 Return             **");
        System.out.println("******************************");

    }


}
