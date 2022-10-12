using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Author
    {
        public string Name { get; set; }

        public Author(string authorName)
        {
            Name = authorName;
        }

        public void Print()
        {
            Console.Write(Name);
        }
    }
}
