
import dal.ApplicantsDAO;
import dal.contactDAO;
import dal.programsDAO;
import dal.universityDAO;
import dal.userDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Programs;
import model.contact;

public class test {

    public static void main(String[] args) {
        ApplicantsDAO getA = new ApplicantsDAO();
        String date1 = "02-02-2002";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date sqlDate = null;
        userDAO getU = new userDAO();
        try {
            Date utilDate = dateFormat.parse(date1);
            sqlDate = new java.sql.Date(utilDate.getTime());
//            System.out.println(sqlDate); // This will print the parsed date as a SQL date
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the parsing exception here
        }

//        try {
//            getA.UpdateApplicants("Nguyen Hong Phuc", "Male", date1, "Hung Yen", "0965897616", "phuc@gmail.com", "1");
//        } catch (Exception e) {
//            e.printStackTrace(); // Handle any SQL exception from the UpdateApplicants method
//        }
//         getU.addNewUser("vinh", "123", "user");
//         ArrayList<user> listU = getU.getAllUser();
//        int idLast = 0;
//        for (user u : listU) {
//            if (u.getId() > idLast) {
//                idLast = u.getId();
//            }
//        }
//        getA.addNewApplicants(26, "Cao Vinh", "Male", sqlDate, "Hanoi", "0377373282", "bsb@abc.com");
//ArrayList<Applicants> list = getA.getAllApplicantsByID("1");
//System.out.println(list);

//    contactDAO get = new contactDAO();
//    ArrayList<contact> list  =get.getContact();
//        System.out.println(list);
//    }


        programsDAO getP = new programsDAO();
//        ArrayList<Programs> listP = getP.getALlByID("1");
//        System.out.println(listP);
//getP.update("12", "tuyensinhso", "des", "2022-02-02", "2022-02-10", "11", "req");
//getP.addNew("FPT", "FPT", "2022-02-02", "2022-02-03", 1, "Pass");
        universityDAO getUni = new universityDAO();
        getUni.addnew("aa", "aa", "aa", "aa", "aa", "aaa");
//        getUni.updateU("11", "NUC", "Nong Lam University", "Dai hoc Nong Lam", "Miền Nam", "Thành phố Hồ Chí Minh", "Công lập");
    }
}
