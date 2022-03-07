package prototype

import "testing"

func TestRun(t testing.T) {
    file1 := &prototype.File{
		Name: "File1",
	}
	file2 := &prototype.File{
		Name: "File2",
	}
	file3 := &prototype.File{
		Name: "File3",
	}
	folder1 := &prototype.Folder{
		Children: []prototype.INode{file1},
		Name:     "folder1",
	}
	folder2 := &prototype.Folder{
		Children: []prototype.INode{folder1, file2, file3},
		Name:     "folder2",
	}
	fmt.Println("\nPrinting hierarchy for Folder2")
	folder2.Print(" ")

	cloneFolder := folder2.Clone()
	fmt.Println("\nPrinting hierarchy for clone Folder")
	cloneFolder.Print("  ")
}