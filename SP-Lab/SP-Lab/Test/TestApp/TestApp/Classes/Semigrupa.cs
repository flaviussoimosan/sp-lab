using TestApp.Interfaces;

namespace TestApp.Classes
{
    public class Semigrupa : ISemigrupa
    {
        public string Nume { get; set; }

        public List<Student> Students = new List<Student>();

        public Semigrupa(string nume)
        {
            Nume = nume;
        }

        public void Add(Student student)
        {
            if(Students.Count <= 15)
            {
                Students.Add(student);
            }
            else
            {
                throw new Exception("Semigrupa nu mai accepta studenti");
            }
        }

        public void Print()
        {
            Console.WriteLine("\t\t"+Nume);
            foreach(var student in Students)
            {
                Console.WriteLine("\t\t\t"+student.Nume + ", " + student.Email);
            }

                
        }
    }
}
