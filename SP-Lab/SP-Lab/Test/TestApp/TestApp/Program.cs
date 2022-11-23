using TestApp.Classes;

class TestClass
{
    static void Main(string[] args)
    {
        An Info3 = new An("Informatica 3");
        var grupa1 = new Grupa("Grupa 1");
        var semigrupa1 = new Semigrupa("Semigrupa 1.1");
        semigrupa1.Add(new Student("Popescu I", "popescu@Acme.edu"));
        semigrupa1.Add(new Student("Ionescu E", "ionescu@Acme.edu"));
        grupa1.Add(semigrupa1);
        var semigrupa2 = new Semigrupa("Semigrupa 1.2");
        semigrupa2.Add(new Student("Vasilescu I", "vasilescu@Acme.edu"));
        semigrupa2.Add(new Student("Georgescu ", "georgescu@Acme.edu"));
        grupa1.Add(semigrupa2);
        Info3.Add(grupa1);
        Info3.Add(new Grupa("Grupa 2"));

        Info3.Print();

        //Am schimbat structura clasei de main pentru ca nu imi aduc aminte cum se fac un visitor.
        //Va rog sa ma scuzati pentru aceasta.

    }
}
