//演習７のためのクラス
package sample;

public class MedalFactory {

    private Employee[] employees; //工場で働く従業員

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String makeMedal(Material materials[4]){
    for(Employee2 employee : employees){
        int totalSalary = 0;
        totalSalary = totalSalary + employee.getSalary();
       }
    
       Medal[] medals = new Medal[4];

       for(int i=0;i < materials.length;i++){
       if(materials[i] == "金"){
        medals[0] = "金メダル";
        medals[0].setPrice(10000 +(totalSalary / 1) * 1.2);


       }else if(materials[i] == "銀"){
        medals[1] = "銀メダル";
        medals[1].setPrice(5000 +(totalSalary / 1) * 1.2);

       }else if(materials[i] == "銅"){
        medals[2] = "銅メダル";
        medals[2].setPrice(1000 +(totalSalary / 1) * 1.2);

       }else{
        medals[4] = "不良品";
        price = 0;
       }


      }
        return medals[i];
     }
    }
