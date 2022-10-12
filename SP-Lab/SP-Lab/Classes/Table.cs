using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Table
    {
        public string Name { get; set; }

        public Table(string newTableName)
        {
            Name = newTableName;
        }

        public void Print()
        {
            Console.WriteLine("Table : " + Name);
        }
    }
}
