package visitor

import "fmt"

type AreaCalculator struct {
	Area int
}

func (a *AreaCalculator) VisitForSquare(s *Square) {
	// Calculate area for square.
	// Then assign in to the area instance variable.
	fmt.Println("Calculating area for square")
}

func (a *AreaCalculator) VisitForCircle(c *Circle) {
	fmt.Println("Calculating area for circle")
}

func (a *AreaCalculator) VisitForRectangle(r *Rectangle) {
	fmt.Println("Calculating area for rectangle")
}
