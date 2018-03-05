package stepdefs;

import acceptance.Runner;
import acceptance.client.IvoSchoolDbClient;
import acceptance.type.StudentClassType;
import acceptance.type.StudentType;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.ClassPage;
import pages.StudentPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassStepdefs {

    private ClassPage classPage;
    private IvoSchoolDbClient dbClient;
    Map<Integer, List<String>> subject = new HashMap<>();

    public ClassStepdefs(Runner runner){
        this.classPage = new ClassPage(runner);
        dbClient = IvoSchoolDbClient.getInstance();
    }

    @And("^class has multiple subjects with id \"([^\"]*)\"$")
    public void classHasMultipleSubjectsWithId(int id,List<String> classSubject){
        /*this.*/subject.put(id,classSubject);
    }


    @And("^class details are entered on class page$")
    public void classDetailsAreEnteredOnClassPage(List<StudentClassType> studentClasses) {

        for (StudentClassType student : studentClasses) {
            student.setOfferedClass(subject.get(student.getId()));
            classPage.createANewClass(student);
        }

    }
}
