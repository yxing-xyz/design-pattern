package singleton

import (
	"fmt"
)

func TestMain(t *testing.T) {
	for i := 0; i < 30; i++ {
		go GetEarth()
	}
	fmt.Scanln()
}
