package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import java.util.Arrays;
import java.util.Optional;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger32BE;

/*
    <enumeratedData>
        <name>EntityControlActionEnum</name>
        <representation>HLAinteger32BE</representation>
        <semantics>Enumeration of Entity Control Actions. The datatype is expected to be extended in specific modules defining additional actions.</semantics>
        <enumerator>
            <name>MagicMove</name>
            <value>10</value>
        </enumerator>
        <enumerator>
            <name>Detach</name>
            <value>18</value>
        </enumerator>
        <enumerator>
            <name>DirectFire</name>
            <value>20</value>
        </enumerator>
        <enumerator>
            <name>IndirectFire</name>
            <value>22</value>
        </enumerator>
        <enumerator>
            <name>FollowEntity</name>
            <value>24</value>
        </enumerator>
        <enumerator>
            <name>MoveInDirection</name>
            <value>25</value>
        </enumerator>
        <enumerator>
            <name>MoveIntoFormation</name>
            <value>26</value>
        </enumerator>
        <enumerator>
            <name>MoveToLocation</name>
            <value>28</value>
        </enumerator>
        <enumerator>
            <name>Attach</name>
            <value>30</value>
        </enumerator>
        <enumerator>
            <name>Observe</name>
            <value>31</value>
        </enumerator>
        <enumerator>
            <name>OperateCheckpoint</name>
            <value>32</value>
        </enumerator>
        <enumerator>
            <name>Patrol</name>
            <value>33</value>
        </enumerator>
        <enumerator>
            <name>ChangeAltitude</name>
            <value>35</value>
        </enumerator>
        <enumerator>
            <name>ChangeSpeed</name>
            <value>36</value>
        </enumerator>
        <enumerator>
            <name>StopAtSideOfRoad</name>
            <value>39</value>
        </enumerator>
        <enumerator>
            <name>ChangeHeading</name>
            <value>40</value>
        </enumerator>
        <enumerator>
            <name>OtherActivity</name>
            <value>42</value>
        </enumerator>
        <enumerator>
            <name>MoveByRoute</name>
            <value>29</value>
        </enumerator>
        <enumerator>
            <name>OperateObservationPost</name>
            <value>34</value>
        </enumerator>
        <enumerator>
            <name>EnterFacility</name>
            <value>21</value>
        </enumerator>
        <enumerator>
            <name>SetRulesOfEngagement</name>
            <value>41</value>
        </enumerator>
    </enumeratedData>
 */

public enum EntityControlActionEnum32 {
    MagicMove(10),
    Detach(18),
    DirectFire(20),
    EnterFacility(21),
    IndirectFire(22),
    FollowEntity(24),
    MoveInDirection(25),
    MoveIntoFormation(26),
    MoveToLocation(28),
    MoveByRoute(29),
    Attach(30),
    Observe(31),
    OperateCheckpoint(32),
    Patrol(33),
    OperateObservationPost(34),
    ChangeAltitude(35),
    ChangeSpeed(36),
    StopAtSideOfRoad(39),
    ChangeHeading(40),
    SetRulesOfEngagement(41),
    OtherActivity(42);

    private final HLAinteger32BE value;

    private EntityControlActionEnum32(int value) {
        this.value = HLAroot.getEncoderFactory().createHLAinteger32BE(value);
    }

    synchronized public int getValue() {
        return value.getValue();
    }

    public HLAinteger32BE getDataElement() {
        return value;
    }

    private static Optional<EntityControlActionEnum32> valueOf(int i) {
        return Arrays.asList(values()).stream().filter(s -> s.getValue() == i).findAny();
    }

    public static EntityControlActionEnum32 get(int i) throws DecoderException {
        Optional<EntityControlActionEnum32> v = valueOf(i);
        if (v.isPresent()) {
            return v.get();
        } else {
            throw new DecoderException("Invalid enum value ");
        }
    }

    public static EntityControlActionEnum32 decode(byte[] bytes) throws DecoderException {
        HLAinteger32BE de = HLAroot.getEncoderFactory().createHLAinteger32BE();
        de.decode(bytes);
        Optional<EntityControlActionEnum32> v = valueOf(de.getValue());
        if (v.isPresent()) {
            return v.get();
        } else {
            throw new DecoderException("Invalid enum value ");
        }
    }    
}
