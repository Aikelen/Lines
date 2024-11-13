public class Main {
    public static void main(String[] args) {
        //1
        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName+firstName+middleName;
        System.out.println(fullName);

        //2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
        //3
        String fullNameTrue = "Иванов Семён Семёнович";
        fullNameTrue= fullNameTrue.replace("ё", "е");
        System.out.println(fullNameTrue);
    }
}