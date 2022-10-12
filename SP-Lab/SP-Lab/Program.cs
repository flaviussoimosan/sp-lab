using SP_Lab.Classes;
using System;

namespace SP_Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            Book discoTitanic = new Book("Disco Titanic");
            Author rpGheo = new Author("Radu Pavel");

            discoTitanic.AddBookAuthor(rpGheo);
            int indexChapterOne = discoTitanic.CreateNewChapter("Capitolul 1");
            Chapter cph1 = discoTitanic.GetChapter(indexChapterOne);
            var indexSubChapter = cph1.CreateNewSubchapter("Subcapitolul 1.1");
            SubChapter sc1 = cph1.GetSubChapter(indexSubChapter);

            sc1.CreateNewParagraph("Paragraph 1");
            sc1.CreateNewParagraph("Paragraph 2");
            sc1.CreateNewParagraph("Paragraph 3");
            sc1.CreateNewImage("Image 1");
            sc1.CreateNewParagraph("Paragraph 4");
            sc1.CreateNewTable("Table 1");
            sc1.CreateNewParagraph("Paragraph 5");

            sc1.Print();

        }
    }
}
