/*
 Copyright (C) 2015  Nikos Siatras

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 SourceRabbit GCode Sender is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sourcerabbit.gcode.sender.Core.CNCController.Tools;

/**
 *
 * @author Nikos Siatras
 */
public class Position3D
{

    private Double fX, fY, fZ;

    public Position3D()
    {

    }

    public Position3D(Double x, Double y, Double z)
    {
        fX = x;
        fY = y;
        fZ = z;
    }

    public void setX(Double x)
    {
        fX = x;
    }

    public void setY(Double y)
    {
        fY = y;
    }

    public void setZ(Double z)
    {
        fZ = z;
    }

    public void setPosition(Double x, Double y, Double z)
    {
        fX = x;
        fY = y;
        fZ = z;
    }

    public Double getX()
    {
        return fX;
    }

    public Double getY()
    {
        return fY;
    }

    public Double getZ()
    {
        return fZ;
    }
}
