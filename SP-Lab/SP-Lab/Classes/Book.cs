using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Book
    {
        public string Title { get; set; }

        public Author Author { get; set; }

        public List<Chapter> Chapters { get; set; }

        public Book(string bookTitle)
        {
            Title = bookTitle;
            Chapters = new List<Chapter>();
        }

        public void AddBookAuthor(Author author)
        {
            Author = author;
        }

        public int CreateNewChapter(string chapterName)
        {
            var chapter = new Chapter(chapterName);
            Chapters.Add(chapter);
            var chapterIndex = Chapters.FindIndex(obj => obj.Name == chapter.Name);
            return chapterIndex;
        }

        public Chapter GetChapter(int chapterIndex)
        {
            return Chapters[chapterIndex];
        }

        public void Print()
        {

        }
    }
}
