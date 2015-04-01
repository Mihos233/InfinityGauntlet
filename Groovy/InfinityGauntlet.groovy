metadata {
	definition (name: "InfinityGauntlet", namespace: "Mihos233", author: "Mark Bowling")
    	{
        capability "Switch"
        
        command "spaceOff"
        command "spaceOn"
        command "mindOff"
        command "mindOn" 
        command "soulOff"
        command "soulOn"
        command "realityOff"
        command "realityOn"        
        command "timeOff"
        command "timeOn"
        command "powerOff"
        command "powerOn"         
        }
}
        
	tiles {
		standardTile("space", "device.space", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "spaceon", label: 'Space', action: "spaceOff", icon: "st.switches.switch.on", backgroundColor: "#79b821",nextState: "spaceoff"
			state "spaceoff", label: 'Space', action: "spaceOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "spaceon"
		}
        standardTile("mind", "device.mind", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "mindon", label: 'Mind', action: "mindOff", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "mindoff"
			state "mindoff", label: 'Mind', action: "mindOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "mindon"
		}
        standardTile("soul", "device.soul", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "soulon", label: 'Soul', action: "soulOff", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "souloff"
			state "souloff", label: 'Soul', action: "soulOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "soulon"
		}
        standardTile("reality", "device.reality", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "realityon", label: 'Reality', action: "realityOff", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "realityoff"
			state "realityoff", label: 'Reality', action: "realityOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "realityon"
		}
        standardTile("time", "device.time", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "timeon", label: 'Time', action: "timeOff", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "timeoff"
			state "timeoff", label: 'Time', action: "timeOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "timeon"
		}
        standardTile("power", "device.power", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true) {
			state "poweron", label: 'Power', action: "powerOff", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "poweroff"
			state "poweroff", label: 'Power', action: "powerOn", icon: "st.switches.switch.off", backgroundColor: "#ffffff", nextState: "poweron"
		}
        
		main ("soul")
		details (["space","mind","soul","reality","time","power"])
	}


def parse(String description) {
	def value = zigbee.parse(description)?.text
	def name = value && value != "ping" ? "response" : null
	def result = createEvent(name: name, value: value)
    if (value!= "ping"){
	log.debug "Parse returned ${result?.descriptionText}"
	return result
    }
}


def spaceOn() {
	zigbee.smartShield(text: "spaceOn").format()
}    

def spaceOff() {
	zigbee.smartShield(text: "spaceOff").format()
}

def mindOn() {
	zigbee.smartShield(text: "mindOn").format()
}

def mindOff() {
	zigbee.smartShield(text: "mindOff").format()
}

def soulOn() {
	zigbee.smartShield(text: "soulOn").format()
}

def soulOff() {
	zigbee.smartShield(text: "soulOff").format()
}

def realityOn() {
	zigbee.smartShield(text: "realityOn").format()
}

def realityOff() {
	zigbee.smartShield(text: "realityOff").format()
}

def timeOn() {
	zigbee.smartShield(text: "timeOn").format()
}

def timeOff() {
	zigbee.smartShield(text: "timeOff").format()
}

def powerOn() {
	zigbee.smartShield(text: "powerOn").format()
}

def powerOff() {
	zigbee.smartShield(text: "powerOff").format()
}
