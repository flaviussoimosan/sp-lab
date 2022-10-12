using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Paragraph
    {
        public string Text { get; set; }

        public Paragraph(string newParagraphText)
        {
            Text = newParagraphText;
        }

        public void Print()
        {
            Console.WriteLine("Paragraph : " + Text);
        }
    }
}
