package builder

import "github.com/pingcap/errors"

type IBuilder interface {
	SetWindowType()
	SetDoorType()
	SetNumFloor()
	GetHouse() *House
}

func GetBuilder(builderType string) (IBuilder, error) {
	if builderType == "normal" {
		return NewNormalBuilder(), nil
	}
	if builderType == "igloo" {
		return NewIgLooBuilder(), nil
	}
	return nil, errors.New("unknown builder type")
}
