package CECS;

public interface OSGIServices{

//    public void queryCityLegislation( String zipcode );

    public void get_Name();
    public void get_HomeDirectory();

    public void getLibrary(Student cecs_student ) ;
    public void getExportFormat(Student cecs_student ) ;
    public void getPortNumber(Student cecs_student ) ;
    public void getSOA(Student cecs_student ) ;

}
