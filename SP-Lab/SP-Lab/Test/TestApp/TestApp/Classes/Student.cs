using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestApp.Classes
{
    public class Student
    {
        public string Nume { get; set; }
        public string Email { get; set; }

        public Student(string nume, string email)
        {
            Nume = nume;
            Email = email;
        }
    }
}
