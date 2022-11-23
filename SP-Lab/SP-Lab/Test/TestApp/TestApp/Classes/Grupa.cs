using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestApp.Interfaces;

namespace TestApp.Classes
{
    public class Grupa : IGrupa
    {
        public string Nume { get; set; }
        public IList<Semigrupa> Semigrupe = new List<Semigrupa>();

        public Grupa(string nume)
        {
            Nume = nume;
        }

        public void Add(Semigrupa semigrupa)
        {
            if (Semigrupe.Count <= 15)
            {
                Semigrupe.Add(semigrupa);
            }
            else
            {
                throw new Exception("Grupa nu poate avea mai mult de doua semigrupe");
            }
        }

        public void Print()
        {
            Console.WriteLine(Nume);
            foreach (var semigrupa in Semigrupe)
            {
                semigrupa.Print();
            }

        }
    }
}
