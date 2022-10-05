using SP_Lab.Classes;
using System;

namespace SP_Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Book book = new Book();
            book.CreateNewParagraph("paragraph 1");
            book.CreateNewParagraph("paragraph 2");
            book.CreateNewParagraph("paragraph 3");
            book.CreateNewImage("image");
            book.CreateNewParagraph("paragraph 4");
            book.CreateNewTable("table");
            book.CreateNewParagraph("paragraph 5");

            book.Print();
        }
    }
}
