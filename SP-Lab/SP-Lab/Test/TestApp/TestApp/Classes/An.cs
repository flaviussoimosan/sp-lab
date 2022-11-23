using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestApp.Interfaces;

namespace TestApp.Classes
{
    public class An : IAn
    {
        public string Nume { get; set; }
        public List<Grupa> Grupe = new List<Grupa>();

        public An(string nume)
        {
            Nume = nume;
        }

        public void Add(Grupa grupa)
        {
            Grupe.Add(grupa);
        }

        public void Print()
        {
            Console.WriteLine(Nume);
            foreach (var grupa in Grupe)
            {
                grupa.Print();
            }

        }
    }
}
