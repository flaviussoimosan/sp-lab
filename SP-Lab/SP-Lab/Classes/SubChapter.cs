using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
     public class SubChapter
    {
        public string Name { get; set; }
        public List<Paragraph> Paragraphs { get; set; }
        public List<Image> Images { get; set; }
        public List<Table> Tables { get; set; }

        public SubChapter(string chapterName)
        {
            Name = chapterName;
            Paragraphs = new List<Paragraph>();
            Images = new List<Image>();
            Tables = new List<Table>();
        }

        public void CreateNewParagraph(string newParagraphText)
        {
            var newParagraph = new Paragraph(newParagraphText);
            Paragraphs.Add(newParagraph);
        }

        public void CreateNewImage(string newImageName)
        {
            var newImage = new Image(newImageName);
            Images.Add(newImage);
        }

        public void CreateNewTable(string newTableName)
        {
            var newTable = new Table(newTableName);
            Tables.Add(newTable);
        }

        public void Print()
        {
            Console.WriteLine("SubChapter : " + Name);

            foreach (var paragraph in Paragraphs)
            {
                paragraph.Print();
            }

            foreach (var image in Images)
            {
                image.Print();
            }

            foreach (var table in Tables)
            {
                table.Print();
            }
        }
    }
}
