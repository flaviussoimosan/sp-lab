using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Chapter
    {
        public string Name { get; set; }
        public List<SubChapter> SubChapters { get; set; }

        public Chapter(string chapterName)
        {
            Name = chapterName;
            SubChapters = new List<SubChapter>();
        }

        public int CreateNewSubchapter(string newSubChapterName)
        {
            var newSubChapter = new SubChapter(newSubChapterName);
            SubChapters.Add(newSubChapter);
            var newSubChapterIndex = SubChapters.FindIndex(subChapther => subChapther == newSubChapter);
            return newSubChapterIndex;
        }

        public SubChapter GetSubChapter(int subChapterIndex)
        {
            return SubChapters[subChapterIndex];
        }

        public void Print()
        {
            Console.WriteLine(Name);
        }
    }
}
