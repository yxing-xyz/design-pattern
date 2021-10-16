package adapter

import "testing"

func TestMain(t *testing.T) {

	client := &client{}
	mac := &mac{}
	client.insertLightningConnectorIntoComputer(mac)

	windowMachine := &windows{}

	windowsMachineAdapter := &windowsAdapter{
		windowMachine: windowMachine,
	}
	client.insertLightningConnectorIntoComputer(windowsMachineAdapter)
}
