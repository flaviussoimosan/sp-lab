using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Book
    {
        public List<string> BookContent { get; set; }
        public Book()
        {
            BookContent = new List<string>();
        }

        public void CreateNewParagraph (string paragraph)
        {
            this.BookContent.Add(paragraph);
        }

        public void CreateNewImage(string image)
        {
            this.BookContent.Add(image);
        }

        public void CreateNewTable(string table)
        {
            this.BookContent.Add(table);
        }

        public void Print()
        {
            foreach (string row in BookContent)
            {
                Console.WriteLine(row);
            }
        }
    }
}
