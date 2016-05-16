/*
 *    © Copyright 2016 IBM Corp.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.ibm.mobilefirst.mobileedge.events;

import com.ibm.mobilefirst.mobileedge.SensorType;

import java.util.HashMap;

/**
 * Hold the inner system events
 */
public class SystemEvents {

    HashMap<SensorType,SensorEvents> eventsHashMap = new HashMap<>();

    public SensorEvents getSensorEvents(SensorType type){
        if (!eventsHashMap.containsKey(type)){
            eventsHashMap.put(type, new SensorEvents());
        }

        return eventsHashMap.get(type);
    }
}
