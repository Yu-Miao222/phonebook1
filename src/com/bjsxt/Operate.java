package com.bjsxt;


import java.util.*;

/**
 * core operate class
 *
 */

public class Operate {
    private List<Person> list;

    public Operate() {
        this.list = new ArrayList<>();
    }

    /**
     * Create Contact logic
     */
    public void addLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while(true){
            menu.addMenu();
             int item = telNoteRegex.menuItemValidate(1,3);
             switch (item){
                 case 1 : this.addOperation();break;
                 case 2 : this.showAll();break;
                 case 3 : return;

             }
        }

    }


    /**
     * Search contact logic
     */
    public void searchLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
           menu.searchMenu();
           int item = telNoteRegex.menuItemValidate(1,7);
           switch (item){
               case 1 : this.searchByName(); break;
               case 2 : this.searchByAge();break;
               case 3 : this.searchByGender();break;
               case 4 : this.searchByTelNum();break;
               case 5 : this.searchByAdd();break;
               case 6 : this.showAll();break;
               case 7 : return;
           }

        }
    }


    /**
     * Edit contact logic
     */
    public void modifyLogic() {
        Menu menu = new Menu();
        TelNoteRegex  telNoteRegex = new TelNoteRegex();
        while (true){
            menu.modifyMenu();
            int item = telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1 : this.showAll();break;
                case 2 : this.modifyOperation();break;
                case 3 : return;
            }

        }
    }


    /**
     * Delete contact logic
     */
    public void deleteLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.deleteMenu();
            int item = telNoteRegex.menuItemValidate(1,4);
            switch (item){
                case 1 : this.showAll(); break;
                case 2 : this.deleteOperation();break;
                case 3 : this.deleteAllOperation();break;
                case 4 : return;
            }
        }
    }


    /**
     * Order contact logic
     */
    public void orderLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.orderMenu();
            int item = telNoteRegex.menuItemValidate(1,5);
            switch (item){
                case 1 : this.orderName(); break;
                case 2 : this.orderAge();break;
                case 3 : this.orderGender();break;
                case 4 : this.showAll();break;
                case 5 : return;
            }
        }
    }

    /**
     * Create new contact
     */
    public void addOperation() {
        TelNoteRegex  telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        String age = telNoteRegex.ageValidate();
        String gender = telNoteRegex.genderValidate();
        String telNum = telNoteRegex.telNumValidate();
        String address = telNoteRegex.addressValidate();
        Person person = new Person(name,age,gender,telNum,address);
        this.list.add(person);
        person.setId(this.list.size());


    }

    /**
     * Show all contact
     */
    public void showAll() {
        if(this.list.size()==0){
            System.out.println("No Contact Found");
            return;
        }
        for(int i = 0; i< list.size(); i++){
            System.out.println(this.list.get(i));
        }

    }

    /**
     * Search by name
     */
    public void searchByName() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag = true;
        for(int i = 0;i<this.list.size(); i++){
           if(name.equals(this.list.get(i).getName())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("No Contact Found ");
        }

    }

    /**
     * Search by age
     */
    public void searchByAge() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag = true;
        for(int i = 0; i< this.list.size();i++){
            if (age.equals(this.list.get(i).getAge())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag){
            System.out.println("No Contact Found ");
        }


    }

    /**
     * Search by gender
     */
    public void searchByGender() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String gender = telNoteRegex.genderValidate();
        boolean flag = true;
        for(int i = 0; i< this.list.size();i++){
            if(gender.equalsIgnoreCase(this.list.get(i).getGender())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag){
            System.out.println("No Contact Found ");
        }

    }

    /**
     * Search by tel-number
     */
    public void searchByTelNum() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNumValidate();
        boolean flag = true;
        for(int i = 0; i< this.list.size();i++){
            if(telNum.equals(this.list.get(i).getTelNum())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println(" No Contact Found ");
        }

    }

    /**
     * Search by address
     */
    public void searchByAdd() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidate();
        boolean flag = true;
        for(int i = 0; i< this.list.size();i++){
            if(address.equals(this.list.get(i).getAddress())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println(" No Contact Found ");
        }

    }

    /**
     * Edit contact
     */
    public void modifyOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu = new Menu();
        //对被修改的记录的序号进行验证，可以使用对菜单项验证的方法来完成
        System.out.println("Please enter contact item number ");
        int itemNum = telNoteRegex.menuItemValidate(1,this.list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegex.menuItemValidate(1,6);
        switch (menuItem){
            case 1: String name = telNoteRegex.nameValidate();(this.list.get(itemNum-1)).setName(name); break;
            case 2: String age = telNoteRegex.ageValidate();(this.list.get(itemNum-1)).setAge(age);break;
            case 3: String gender = telNoteRegex.genderValidate();(this.list.get(itemNum-1)).setGender(gender);break;
            case 4: String telNum = telNoteRegex.telNumValidate();(this.list.get(itemNum-1)).setTelNum(telNum);break;
            case 5: String address = telNoteRegex.addressValidate();(this.list.get(itemNum-1)).setAddress(address);break;
            case 6: return;
        }


    }

    /**
     * Delete contact
     */
    public void deleteOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        System.out.println("Please enter contact item number");
        int itemNum = telNoteRegex.menuItemValidate(1, this.list.size());
        this.list.remove(itemNum-1);
        //重新为记录设置新的序号
        for(int i = 0; i < this.list.size(); i++){
            (this.list.get(i)).setId(i+1);
        }
        System.out.println("Delete success! Please continue! ");

    }

    /**
     * Delete all contact
     */
    public void deleteAllOperation() {
        this.list.clear();
        System.out.println("Successfully delete all contact!");


    }

    /**
     * Order by name
     */
    public void orderName() {
        Collections.sort(this.list,new OrderByName());
        for(int i = 0; i< this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }

    }

    /**
     * Order by age
     */
    public void orderAge() {
        Collections.sort(this.list,new orderByAge());
        for (int i = 0; i< this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }

    }

    /**
     * Order by gender
     */
    public void orderGender() {
        Collections.sort(this.list,new orderByGender());
        for (int i = 0; i< this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }

    }

    /**
     * Compare by "order by name"
     */
    class OrderByName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }


    /**
     * Compare by "order by age"
     */
    class orderByAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }


    /**
     * Compare by "order by gender"
     */
    class orderByGender implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getGender().compareTo(o2.getGender());
        }
    }

}


